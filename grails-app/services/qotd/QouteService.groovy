package qotd

import grails.transaction.Transactional

@Transactional
class QouteService {

    def getStaticQuote() {
        return new Qoute(author: "Anonymous", content: "Real Programmers don't eat much quiche")
    }

    def getRandomQuote() {
        def allQuotes = Qoute.list()
        def randomQuote
        if (allQuotes.size() > 0) {
            def index = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[index]
        } else {
            randomQuote = getStaticQuote()
        }
        return randomQuote
    }
}
