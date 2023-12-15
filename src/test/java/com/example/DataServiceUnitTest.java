package com.example;

import static org.mockito.Mockito.mock;
import org.junit.Test;


public class DataServiceUnitTest {

	ExternalService externalService = mock(ExternalService.class);
	DataService dataService = new DataService(externalService);
	
	@Test
	public void testFetchData() {



	}
	
    @Test
    public void testFetchStaticData() {
    	


    }

	
}

