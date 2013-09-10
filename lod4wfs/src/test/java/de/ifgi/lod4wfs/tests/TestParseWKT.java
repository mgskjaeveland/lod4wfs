package de.ifgi.lod4wfs.tests;

import it.cutruzzula.lwkt.WKTParser;

public class TestParseWKT {

	public static void main(String[] args) {
		
		
		//String wkt= "POLYGON ((30 10, 10 20, 20 40, 40 40, 30 10))";
		//String wkt="POLYGON ((-61.6866679999999974 17.0244409999999995, -61.8872220000000013 17.1052740000000014, -61.7944490000000002 17.1633299999999984, -61.6866679999999974 17.0244409999999995)) POLYGON ((-61.7291719999999984 17.6086080000000003, -61.8530579999999972 17.5830540000000006, -61.8730619999999973 17.7038879999999992, -61.7291719999999984 17.6086080000000003))";
		String wkt="MULTIPOLYGON (((121.5763929999999959 22.0013889999999996, 121.4902569999999997 22.0786090000000002, 121.5469439999999963 22.0780530000000006, 121.5763929999999959 22.0013889999999996)), ((119.6694339999999954 23.5499989999999997, 119.5267029999999977 23.5354610000000015, 119.5983279999999951 23.6069409999999991, 119.6694339999999954 23.5499989999999997)), ((118.2236019999999996 24.4041630000000005, 118.2074889999999954 24.4124949999999998, 118.2413640000000044 24.4458270000000013, 118.2236019999999996 24.4041630000000005)), ((118.4191440000000028 24.3958280000000016, 118.2755429999999990 24.3991620000000005, 118.4016570000000002 24.5216640000000012, 118.4191440000000028 24.3958280000000016)), ((121.7347110000000043 25.1388849999999984, 122.0022129999999976 25.0069429999999997, 121.8397060000000067 24.4763829999999984, 120.7163769999999943 21.9280510000000000, 120.0527569999999997 23.0449979999999996, 120.1113660000000039 23.6202739999999984, 121.0091630000000009 25.0088879999999989, 121.7347110000000043 25.1388849999999984)), ((119.9294280000000015 26.1349950000000000, 119.9094159999999931 26.1594389999999990, 119.9524770000000018 26.1599959999999996, 119.9294280000000015 26.1349950000000000)), ((119.9672089999999969 26.1874959999999994, 119.9563830000000024 26.2155489999999993, 120.0061039999999934 26.2191620000000007, 119.9672089999999969 26.1874959999999994)))";
		//String wkt = "LINESTRING (146.4685819999999978 -41.2414780000000007, 146.5747680000000059 -41.2511859999999970, 146.6404110000000003 -41.2551539999999974, 146.7661290000000065 -41.3323480000000032, 146.7941889999999887 -41.3441699999999983, 146.8221739999999897 -41.3629880000000014, 146.8634340000000122 -41.3802340000000015, 146.8995209999999929 -41.3794520000000006, 146.9295040000000085 -41.3782270000000025, 147.0080409999999915 -41.3560790000000011, 147.0983429999999998 -41.3629189999999980)";
		
		try {
			//To get output as GML version 2:
			String output1 = WKTParser.parseToGML2(wkt);
			
			//To get output as GML version 3;
			String output2 = WKTParser.parseToGML2(wkt,"EPSG:4326");

			//To get output as GML version 3, setting EPSG:4326 as srs-name;
			String output3 = WKTParser.parseToGML3(wkt, "EPSG:4326");
			
			System.out.println(output1);
			System.out.println(output2);
			System.out.println(output3);
			
//			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
//			Document document = documentBuilder.parse("src/main/resources/NewFile.xml");
					  
//			System.out.println("xyz ->"  + document.getDocumentElement().getNodeName());

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
