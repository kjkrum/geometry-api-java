package com.esri.core.geometry;

import junit.framework.TestCase;
import org.junit.Test;

public class TestSpatialReference  extends TestCase {
    @Test
    public void testEquals() {
        String wktext1 = "GEOGCS[\"GCS_WGS_1984\",DATUM[\"D_WGS_1984\",SPHEROID[\"WGS_1984\",6378137.0,298.257223563]],PRIMEM[\"Greenwich\",0.0],UNIT[\"Degree\",0.0174532925199433]]";
        String wktext2 = "PROJCS[\"WGS_1984_Web_Mercator_Auxiliary_Sphere\",GEOGCS[\"GCS_WGS_1984\",DATUM[\"D_WGS_1984\",SPHEROID[\"WGS_1984\",6378137.0,298.257223563]],PRIMEM[\"Greenwich\",0.0],UNIT[\"Degree\",0.0174532925199433]],PROJECTION[\"Mercator_Auxiliary_Sphere\"],PARAMETER[\"False_Easting\",0.0],PARAMETER[\"False_Northing\",0.0],PARAMETER[\"Central_Meridian\",0.0],PARAMETER[\"Standard_Parallel_1\",0.0],PARAMETER[\"Auxiliary_Sphere_Type\",0.0],UNIT[\"Meter\",1.0]]";

        SpatialReference a1 = SpatialReference.create(wktext1);
        SpatialReference b = SpatialReference.create(wktext2);
        SpatialReference a2 = SpatialReference.create(wktext1);

        assertTrue(a1.equals(a1));
        assertTrue(b.equals(b));

        assertTrue(a1.equals(a2));

        assertFalse(a1.equals(b));
        assertFalse(b.equals(a1));
    }
}

