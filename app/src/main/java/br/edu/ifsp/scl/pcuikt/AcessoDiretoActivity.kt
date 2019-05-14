package br.edu.ifsp.scl.pcuikt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import org.jetbrains.anko.imageResource
import java.lang.Thread.sleep

class AcessoDiretoActivity : ProgramacaoConcorrenteActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = getString(R.string.acesso_direto)
    }

    override fun run() {
        sleep(CARREGA_IMAGENS_DELAY)

        altaIv.imageResource = R.drawable.android_verde
        baixaIv.imageResource = R.drawable.android_preto
    }
}
