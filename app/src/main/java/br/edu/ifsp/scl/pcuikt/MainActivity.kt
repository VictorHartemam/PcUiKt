package br.edu.ifsp.scl.pcuikt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        principalLv.adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            resources.getStringArray(R.array.opcoes_menu)
        )

        principalLv.setOnItemClickListener(this)

        supportActionBar?.title = getString(R.string.escolha_thread)
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var intent = Intent(this, AcessoDiretoActivity::class.java)
        when(position){
            0 -> intent = Intent(this, AcessoDiretoActivity::class.java)
            1 -> intent = Intent(this, MessageHandlerActivity::class.java)
        }
        startActivity(intent)
    }
}
