package WEEK2.mockingandstubbing.src;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ForMockTest {

        private ExternalAPI apiMock;
        private ForMock main;

        @Before
        public void setUp() {
            apiMock = mock(ExternalAPI.class);
            when(apiMock.fetchRemoteValue()).thenReturn(5);
            main = new ForMock(apiMock);
        }

        @Test
        public void testAddWithRemote() {
            int result = main.addWithRemote(10);
            assertEquals(15, result);  // 10 + mocked 5
        }
    }




