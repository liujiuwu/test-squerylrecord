package test.snippet

import net.liftweb.http.{LiftScreen, S}
import test.model.Author

object AuthorScreen extends LiftScreen {
    object author extends ScreenVar(Author.createRecord)
    _register(() => author.is)
    def finish() {
        S.notice("Got " + author.is.toString)
    }
}
