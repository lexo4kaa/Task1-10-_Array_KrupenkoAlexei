package com.company.xml_parsing.validation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

public class TouristVoucherErrorHandler implements ErrorHandler {
    public static Logger logger = LogManager.getLogger();
    public void warning(SAXParseException e) {
        logger.warn(getLineColumnNumber(e) + "-" + e.getMessage());
    }
    public void error(SAXParseException e) {
        logger.error(getLineColumnNumber(e) + " - " + e.getMessage());
    }
    public void fatalError(SAXParseException e) {
        logger.fatal(getLineColumnNumber(e) + " - " + e.getMessage());
    }
    private String getLineColumnNumber(SAXParseException e) {
        return e.getLineNumber() + " : " + e.getColumnNumber();
    }
}
