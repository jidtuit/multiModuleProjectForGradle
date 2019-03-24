package org.jid.pruebas.subprojects.subproject1.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainSubproject1Test {

    @Test
    void test1_always_OK() {
        //Assertions.fail("KO: Forced error");
        Assertions.assertTrue(1 == 1);
    }

}
