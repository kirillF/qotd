package qotd

class QouteController {

    def index() {
	redirect(action: random)
    }

    def random() {
	def staticAuthor = "Anonymous"
	def staticContent = "Real Programmers don't eat much quiche"
	[ author: staticAuthor, content: staticContent ]
    }
}