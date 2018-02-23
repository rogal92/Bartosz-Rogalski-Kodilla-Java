package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User labamba = new Millenials("Bartosz");
        User grej = new ZGeneration("Piotr");
        User flatron = new YGeneration("Agata");

        //When
        String labambaUses = labamba.publish();
        System.out.println("labamba uses " + labambaUses);
        String grejUses = grej.publish();
        System.out.println("grej uses " + grejUses);
        String flatronUses = flatron.publish();
        System.out.println("flatron Uses " + flatronUses);


        //Then
        Assert.assertEquals("SnapChat",labambaUses);
        Assert.assertEquals("Twitter",grejUses);
        Assert.assertEquals("Facebook",flatronUses);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User labamba = new Millenials("Bartosz");

        //When
        String labambaUses = labamba.publish();
        System.out.println("labamba uses " + labambaUses);
        labamba.setSocialMedia(new FacebookPublisher());
        labambaUses = labamba.publish();
        System.out.println("labamba now uses " + labambaUses);

        //Then
        Assert.assertEquals("Facebook", labambaUses);
    }
}
