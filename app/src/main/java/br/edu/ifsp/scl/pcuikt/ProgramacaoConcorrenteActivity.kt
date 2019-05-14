package br.edu.ifsp.scl.pcuikt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import org.jetbrains.anko.imageResource

abstract class ProgramacaoConcorrenteActivity : AppCompatActivity() {
    lateinit var carregaImagensHandler: CarregaImagensHandler

    companion object constantes {
        const val CARREGA_IMAGENS_MSG = 0
        const val CARREGA_IMAGENS_DELAY = 1000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programacao_concorrente)

        carregaImagensHandler = CarregaImagensHandler()

        carregaImagens()
    }

    abstract fun run()

    fun carregaImagens() {
        val carregaImagensThread: Thread = Thread{ run() }
        carregaImagensThread.start()
    }

    inner class CarregaImagensHandler : Handler() {
        override fun handleMessage(msg: Message?) {
            if (msg?.what == CARREGA_IMAGENS_MSG) {
                altaIv.imageResource = R.drawable.android_verde
                baixaIv.imageResource = R.drawable.android_preto
            }
        }
    }

}
