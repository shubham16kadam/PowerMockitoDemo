package com.powermockito.demo;

import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyString;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;



@RunWith(PowerMockRunner.class)
@PrepareForTest(Tournament.class)
public class TournamentTest {

    @Test
    public void testTournament() {
        try {
            Tournament mock = PowerMockito.mock(Tournament.class);
            PowerMockito.when(mock.isAlreadyRegistered(anyString())).thenReturn(true);
//            PowerMockito.whenNew(Tournament.class).withAnyArguments().thenReturn(mock);
            Tournament.main(null);
        } catch (Exception e) {
            fail();
        }
    }

}