package qotd

class QouteController {
    def scaffold = true

    def index() {
    }

    def qouteService

    def random = {
        def randomQoute = qouteService.getRandomQuote()
        [quote: randomQoute]
    }

    def ajaxRandom = {
        def randomQoute = qouteService.getRandomQuote()
        render "<q>${randomQoute.content}</q>" +
                "<p>${randomQoute.author}</p>"
    }
}
