package jflunt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jflunt.validations.Contract;
import jflunt.validations.ProcessValidator;

public class ExtensibleContractTests {

    @Test
    public void isTruth() {

        Contract wrong = new Contract()
            .requires()
            .mustBe(new ExtensibleContractTests.ProcessWrong(), "boolean", "process error");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .mustBe(new ExtensibleContractTests.ProcessRight(), "boolean", "no process error");

        assertEquals(true, right.isValid());
    }

    public class ProcessWrong implements ProcessValidator {

        @Override
        public boolean run() {
            return false;
        }

    }

    public class ProcessRight implements ProcessValidator {

        @Override
        public boolean run() {
            return true;
        }

    }
}