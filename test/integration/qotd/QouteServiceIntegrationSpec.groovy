package qotd

import grails.test.GrailsUnitTestCase
import org.junit.Assert
import spock.lang.*

/**
 *
 */
class QouteServiceIntegrationSpec extends GrailsUnitTestCase {

    def qouteService

    void testStaticQoute() {
        def staticQoute = qouteService.getStaticQuote()
        Assert.assertEquals("Anonymous", staticQoute.author)
        Assert.assertEquals("Real Programmers don't eat much quiche", staticQoute.content)
    }
}
