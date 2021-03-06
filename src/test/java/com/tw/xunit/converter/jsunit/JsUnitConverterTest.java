package com.tw.xunit.converter.jsunit;

import com.tw.xunit.converter.TestReportConverter;
import com.tw.xunit.model.TestSuite;
import com.tw.xunit.parser.XUnitParser;
import org.junit.Test;

import java.io.File;
import java.util.UUID;

import static com.tw.xunit.helpers.ResourceHelper.resource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class JsUnitConverterTest {
    @Test
    public void testConvertToXUnitFormat() throws Exception {
        File outputDirectory = new File("/tmp/" + UUID.randomUUID());
        new TestReportConverter().convert("jsunit", resource("/sample-jsunit-reports"), outputDirectory);
        File outputFile = new File(outputDirectory.getAbsoluteFile() + "/1.xml.xml");
        TestSuite testSuite = XUnitParser.parseTestSuiteXUnitXML(outputFile);
        assertThat(testSuite.getTestCases().size(), is(330));
    }
}