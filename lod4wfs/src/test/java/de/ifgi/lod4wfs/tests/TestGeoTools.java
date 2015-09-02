package de.ifgi.lod4wfs.tests;

import java.io.IOException;
import org.geotools.feature.SchemaException;
import org.geotools.geometry.GeometryBuilder;
import org.geotools.geometry.text.WKTParser;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.NoSuchAuthorityCodeException;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import com.vividsolutions.jts.io.gml2.GMLWriter;

public class TestGeoTools {

	   public static void main(String[] args) throws ParseException, NoSuchAuthorityCodeException, FactoryException, IOException, SchemaException, java.text.ParseException {
		
		   String wktGeometry = "POLYGON ((-61.6866679999999974 17.0244409999999995, -61.8872220000000013 17.1052740000000014, -61.7944490000000002 17.1633299999999984, -61.6866679999999974 17.0244409999999995)) POLYGON ((-61.7291719999999984 17.6086080000000003, -61.8530579999999972 17.5830540000000006, -61.8730619999999973 17.7038879999999992, -61.7291719999999984 17.6086080000000003))";
		   WKTReader wktR = new WKTReader();
		   
		   Geometry geom = wktR.read(wktGeometry);

		   // write JTS to string
		   GMLWriter gmlW = new GMLWriter(true);
		   gmlW.setSrsName("<http://www.opengis.net/def/crs/EPSG/0/4326>");
		   String gml = gmlW.write(geom);
		   
		   System.out.println(gml);
		   
		   GeometryBuilder gb = new GeometryBuilder(gml);
		   
		   WKTParser wktp = new WKTParser(gb);
		   wktp.parse(wktGeometry);
	        
	        
	}	   
	   
	
}
