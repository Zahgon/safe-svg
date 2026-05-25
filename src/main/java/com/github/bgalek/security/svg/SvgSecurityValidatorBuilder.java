package com.github.bgalek.security.svg;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static com.github.bgalek.security.svg.SvgAttributes.DEFAULT_SVG_ATTRIBUTES;
import static com.github.bgalek.security.svg.SvgElements.DEFAULT_SVG_ELEMENTS;

public class SvgSecurityValidatorBuilder {

    private String[] elements = DEFAULT_SVG_ELEMENTS;

    private String[] attributes = DEFAULT_SVG_ATTRIBUTES;

    private DocumentBuilder xmlParser;

    SvgSecurityValidatorBuilder() {
    }

    public SvgSecurityValidatorBuilder withAdditionalElements(List<String> additionalElements) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SvgSecurityValidatorBuilder withAdditionalAttributes(List<String> additionalAttributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SvgSecurityValidatorBuilder withSyntaxValidation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SvgSecurityValidator build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
