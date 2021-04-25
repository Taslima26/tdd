import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class MathUtilsTest {


    private ReadCSV readCSV;

    @BeforeEach
    void initEach() {
        readCSV = new ReadCSV();
    }

    @Nested
    class AddTest {
        @ParameterizedTest
        @CsvFileSource(resources = "/examples.csv", numLinesToSkip = 1)
        void csvParserWork(String name) {
            assertNotNull(name,"Test file loaded sucessfully");
        }

        @ParameterizedTest
        @CsvFileSource(resources = "/examples.csv", numLinesToSkip = 1)
        void CSVParseWorkFor3WordsName(String name){

        }
    }

}
