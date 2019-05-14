package br.edu.ifsp.scl.pcuikt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message

class MessageHandlerActivity : ProgramacaoConcorrenteActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = getString(R.string.message_handler)
    }

    override fun run() {
        val carregaImagemMessage = Message()
        carregaImagemMessage.what = CARREGA_IMAGENS_MSG

        carregaImagensHandler.sendMessageDelayed(carregaImagemMessage, CARREGA_IMAGENS_DELAY)
    }
}
