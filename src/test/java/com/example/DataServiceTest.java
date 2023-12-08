package com.example;

// DataServiceTest.java
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class DataServiceTest {

    @Test
    public void testFetchData() {
        // Create a mock for ExternalService
        ExternalService externalServiceMock = mock(ExternalService.class);

        // Set up mock behavior
        when(externalServiceMock.getData()).thenReturn("Mocked data");

        // Create the DataService instance with the mock
        DataService dataService = new DataService(externalServiceMock);

        // Call the method being tested
        String result = dataService.fetchData();

        // Verify the interaction and assertions
        verify(externalServiceMock, times(1)).getData();
        assertEquals("Mocked data", result);
    }
}

