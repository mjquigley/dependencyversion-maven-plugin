package cain.josh.maven.dependencyversion;

import org.junit.Test;

import java.io.FileInputStream;
import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class TemplatesFileTest {

    @Test
    public void shouldTemplateFile() throws Exception {
        final Properties properties = new Properties();
        properties.load(new FileInputStream("target/test-classes/testPlugin.properties"));

        assertEquals("1.3.15.Final", properties.getProperty("undertow.version"));
    }
}
