package com.example.jesus.pensum21

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pensum.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Pensum : AppCompatActivity() {

    var textView_Creditos: TextView? = null

    var cred = 18

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pensum)

        var matb = arrayOf('0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0')//50
        val materias = arrayOf(habilidadesdelpensamiento, seminariosistemas, calculoi, quimica, algoritmo, matematicabasicas, comptexto, algebralineal, calculoii, fisicai, programacion, extranjerai, matematicadiscreta, calculoiii, fisicaii, programacionii, humanidades, extranjeraii, estadistica, metodosnumericos, ecuaciones, electiva, estructuradatos, extranjeraiii, entornoeconomico, teoriadelacomp, ensamblador, basededatos, fisicaiii, extranjeraiv, electivaempresarial, lengprog, modcuanti, redes, ingsoftware, extranjerav, gestiondeproyecto, humanidades7, sistemdinamico, sistmoperativo, ingsofwareii, politica, humanidades8, electv8, inteartificial, elecing8ii, elecing8iii, etica, practica, elecing9)
        val verde = arrayOf(R.drawable.habilidadesdelpensamientoverde, R.drawable.seminariosistemasverde,R.drawable.calculoiverde, R.drawable.quimicaverde, R.drawable.algoritmoverde, R.drawable.matematicabasicasverde, R.drawable.comptextocientificosverde, R.drawable.algebralinealverde, R.drawable.calculoiiverde, R.drawable.fisicaiverde, R.drawable.programacionverde, R.drawable.extranjeraiverde, R.drawable.matediscretaverde, R.drawable.calculoiiiverde, R.drawable.fisicaiiverde, R.drawable.programacioniiverde, R.drawable.humanidadesverde, R.drawable.extranjeraiiverde, R.drawable.estadisticaverde, R.drawable.metodosnumericosverde, R.drawable.ecuacionesverde, R.drawable.electivaverde, R.drawable.estructuradatosverde, R.drawable.extranjeraiiiverde, R.drawable.entornoeconomicoverde, R.drawable.teoriadelacompverde, R.drawable.ensambladorverde, R.drawable.basededatosverde, R.drawable.fisicaiiiverde, R.drawable.extranjeraivverde, R.drawable.electivaempresarialverde, R.drawable.lengprogramacionverde, R.drawable.modcuantitativosverde, R.drawable.compredesdecompverde, R.drawable.ingdesoftwareverde, R.drawable.extrangeravverde, R.drawable.gestiondeproyectoverde, R.drawable.humanidades7verde, R.drawable.sistemasdinamicosverde, R.drawable.sisoperativosverde, R.drawable.ingsofwareiiverde, R.drawable.politicaverde, R.drawable.humanidades8verde, R.drawable.elecing8verde, R.drawable.inteartificialverde, R.drawable.elecing8iiverde, R.drawable.elecing8iiiverde, R.drawable.eticaverde, R.drawable.practicaverde, R.drawable.electing9verde)
        val azul = arrayOf(R.drawable.habilidadesdelpensamientoazul, R.drawable.seminariosistemasazul,R.drawable.calculoiazul, R.drawable.quimicaazul, R.drawable.algoritmoazul, R.drawable.matematicabasicasazul, R.drawable.comptextocientificosazul, R.drawable.algebralinealazul, R.drawable.calculoiiazul, R.drawable.fisicaiazul, R.drawable.programacionazul, R.drawable.extranjeraiazul, R.drawable.matediscretaazul, R.drawable.calculoiiiazul, R.drawable.fisicaiiazul, R.drawable.programacioniiazul, R.drawable.humanidadesazul, R.drawable.extranjeraiiazul, R.drawable.estadisticaazul, R.drawable.metodosnumericosazul, R.drawable.ecuacionesazul, R.drawable.electivaazul, R.drawable.estructuradatosazul, R.drawable.extranjeraiiiazul, R.drawable.entornoeconomicoazul, R.drawable.teoriadelacompazul, R.drawable.ensambladorazul, R.drawable.basededatosazul, R.drawable.fisicaiiiazul, R.drawable.extranjeraivazul, R.drawable.electivaempresarialazul, R.drawable.lengprogramacionazul, R.drawable.modcuantitativosazul, R.drawable.compredesdecompazul, R.drawable.ingdesoftwareazul, R.drawable.extrangeravazul, R.drawable.gestiondeproyectoazul, R.drawable.humanidades7azul, R.drawable.sistemasdinamicosazul, R.drawable.sisoperativosazul, R.drawable.ingsofwareiiazul, R.drawable.politicaazul, R.drawable.humanidades8azul, R.drawable.elecing8azul, R.drawable.inteartificialazul, R.drawable.elecing8iiazul, R.drawable.elecing8iiiazul, R.drawable.eticaazul, R.drawable.practicaazul, R.drawable.electing9azul)
        val rojo= arrayOf(R.drawable.habilidadesdelpensamientorojo, R.drawable.seminariosistemasrojo, R.drawable.calculoirojo, R.drawable.quimicarojo, R.drawable.algoritmorojo, R.drawable.matematicabasicasrojo, R.drawable.comptextocientificosrojo, R.drawable.algebralinealrojo, R.drawable.calculoiirojo, R.drawable.fisicairojo, R.drawable.programacionrojo, R.drawable.extranjerairojo, R.drawable.matediscretarojo, R.drawable.calculoiiirojo, R.drawable.fisicaiirojo, R.drawable.programacioniirojo, R.drawable.humanidadesrojo, R.drawable.extranjeraiirojo, R.drawable.estadisticarojo, R.drawable.metodosnumericosrojo, R.drawable.ecuacionesrojo, R.drawable.electivarojo, R.drawable.estructuradatosrojo, R.drawable.extranjeraiiirojo, R.drawable.entornoeconomicorojo, R.drawable.teoriadelacomprojo, R.drawable.ensambladorrojo, R.drawable.basededatosrojo, R.drawable.fisicaiiirojo, R.drawable.extranjeraivrojo, R.drawable.electivaempresarialrojo, R.drawable.lengprogramacionrojo, R.drawable.modcuantitativosrojo, R.drawable.compredesdecomprojo, R.drawable.ingdesoftwarerojo, R.drawable.extrangeravrojo, R.drawable.gestiondeproyectorojo, R.drawable.humanidades7rojo, R.drawable.sistemasdinamicosrojo, R.drawable.sisoperativosrojo, R.drawable.ingsofwareiirojo, R.drawable.politicarojo, R.drawable.humanidades8rojo, R.drawable.elecing8rojo, R.drawable.inteartificialrojo, R.drawable.elecing8iirojo, R.drawable.elecing8iiirojo, R.drawable.eticarojo, R.drawable.practicarojo, R.drawable.electing9rojo)
        val blanco= arrayOf(R.drawable.habilidadesdelpensamientoblanco, R.drawable.seminariosistemas, R.drawable.calculoi, R.drawable.quimica, R.drawable.algoritmo, R.drawable.matematicabasicas, R.drawable.comptextocientificos, R.drawable.algebralineal, R.drawable.calculoii, R.drawable.fisicai, R.drawable.programacion, R.drawable.extranjerai, R.drawable.matematicadiscreta, R.drawable.calculoiii, R.drawable.fisicaii, R.drawable.programacionii, R.drawable.humanidades, R.drawable.extranjeraii, R.drawable.estadistica, R.drawable.metodosnumericos, R.drawable.ecuaciones, R.drawable.electiva, R.drawable.estructuradatos, R.drawable.extranjeraiii, R.drawable.entornoeconomico, R.drawable.teoriadelacomp, R.drawable.ensamblador, R.drawable.basededatos, R.drawable.fisicaiii, R.drawable.extranjeraiv, R.drawable.electivaempresarial, R.drawable.lengprogramacion, R.drawable.modcuantitativos, R.drawable.compredesdecomp, R.drawable.ingdesoftware, R.drawable.extrangerav, R.drawable.gestiondeproyecto, R.drawable.humanidades7, R.drawable.sistemasdinamicos, R.drawable.sisoperativos, R.drawable.ingsofwareii, R.drawable.politica, R.drawable.humanidades8, R.drawable.elecing8, R.drawable.inteartificial, R.drawable.elecing8ii, R.drawable.elecing8iii, R.drawable.etica, R.drawable.practica, R.drawable.electing9)
        val objetoIntent: Intent = intent
        var carre = objetoIntent.getStringExtra("carrera")
        var C=18
        textView_Creditos = this.Creditos
        txtCarrera.text = "  $carre"
        textView_Creditos!!.text = C.toString()
        if (fileList().contains("data25.txt")) try {
            val archivo = InputStreamReader(openFileInput("data25.txt"))
            val br = BufferedReader(archivo)
            var linea = br.readLine()
            val todo = StringBuilder()
            while (linea != null) {
                todo.append(linea)
                linea = br.readLine()
            }
            br.close()
            archivo.close()
            for (i in 0..49) {
                println(matb[i])
                matb[i] = todo[i]

            }
        } catch (e: IOException) {
        }
        boton1.setOnClickListener {
            try {
                val archivo = OutputStreamWriter(openFileOutput("data25.txt", Activity.MODE_PRIVATE))
                for (i in 0..49)
                    archivo.write( matb[i] + "\n")
                archivo.flush()
                archivo.close()
            } catch (e: IOException) {
            }
            Toast.makeText(this, "Los datos fueron grabados", Toast.LENGTH_SHORT).show()
        }

        for (i in 0..49) {
            Estado(matb[i], azul[i], verde[i], rojo[i], materias[i])
        }

        materias[0].setOnClickListener {

            matb[0] = EstadoonClick(matb[0], blanco[0], verde[0], azul[0], rojo[0], 3, materias[0])
        }

        materias[1].setOnClickListener {
            matb[1] = EstadoonClick(matb[1], blanco[1], verde[1], azul[1], rojo[1], 1, materias[1])
        }

        materias[2].setOnClickListener {
            matb[2] = EstadoonClick(matb[2], blanco[2], verde[2], azul[2], rojo[2], 4, materias[2])
        }

        materias[3].setOnClickListener {
            matb[3] = EstadoonClick(matb[3], blanco[3], verde[3], azul[3], rojo[3], 3, materias[3])
        }

        materias[4].setOnClickListener {
            matb[4] = EstadoonClick(matb[4], blanco[4], verde[4], azul[4], rojo[4], 3, materias[4])
        }

        materias[5].setOnClickListener {
            matb[5] = EstadoonClick(matb[5], blanco[5], verde[5], azul[5], rojo[5], 2, materias[5])
        }

        materias[6].setOnClickListener {
            matb[6] = EstadoonClick(matb[6], blanco[6], verde[6], azul[6], rojo[6], 3, materias[6])
        }

        materias[7].setOnClickListener {
            matb[7] = EstadoonClick(matb[7], blanco[7], verde[7], azul[7], rojo[7], 3, materias[7])
        }

        materias[8].setOnClickListener {
            matb[8] = EstadoonClick(matb[8], blanco[8], verde[8], azul[8], rojo[8], 4, materias[8])
        }

        materias[9].setOnClickListener {
            matb[9] = EstadoonClick(matb[9], blanco[9], verde[9], azul[9], rojo[9], 4, materias[9])
        }

        materias[10].setOnClickListener {
            matb[10] = EstadoonClick(matb[10], blanco[10], verde[10], azul[10], rojo[10], 3, materias[10])
        }

        materias[11].setOnClickListener {
            matb[11] = EstadoonClick(matb[11], blanco[11], verde[11], azul[11], rojo[11], 2, materias[11])
        }

        materias[12].setOnClickListener {
            matb[12] = EstadoonClick(matb[12], blanco[12], verde[12], azul[12], rojo[12], C, materias[12])
        }

        materias[13].setOnClickListener {
            matb[13] = EstadoonClick(matb[13], blanco[13], verde[13], azul[13], rojo[13], C, materias[13])
        }

        materias[14].setOnClickListener {
            matb[14] = EstadoonClick(matb[14], blanco[14], verde[14], azul[14], rojo[14], C, materias[14])
        }

        materias[15].setOnClickListener {
            matb[15] = EstadoonClick(matb[15], blanco[15], verde[15], azul[15], rojo[15], C, materias[15])
        }

        materias[16].setOnClickListener {
            matb[16] = EstadoonClick(matb[16], blanco[16], verde[16], azul[16], rojo[16], C, materias[16])
        }

        materias[17].setOnClickListener {
            matb[17] = EstadoonClick(matb[17], blanco[17], verde[17], azul[17], rojo[17], C, materias[17])
        }

        materias[18].setOnClickListener {
            matb[18] = EstadoonClick(matb[18], blanco[18], verde[18], azul[18], rojo[18], C, materias[18])
        }

        materias[19].setOnClickListener {
            matb[19] = EstadoonClick(matb[19], blanco[19], verde[19], azul[19], rojo[19], C, materias[19])
        }

        materias[20].setOnClickListener {
            matb[20] = EstadoonClick(matb[20], blanco[20], verde[20], azul[20], rojo[20], C, materias[20])
        }

        materias[21].setOnClickListener {
            matb[21] = EstadoonClick(matb[21], blanco[21], verde[21], azul[21], rojo[21], C, materias[21])
        }

        materias[22].setOnClickListener {
            matb[22] = EstadoonClick(matb[22], blanco[22], verde[22], azul[22], rojo[22], C, materias[22])
        }

        materias[23].setOnClickListener {
            matb[23] = EstadoonClick(matb[23], blanco[23], verde[23], azul[23], rojo[23], C, materias[23])
        }

        materias[24].setOnClickListener {
            matb[24] = EstadoonClick(matb[24], blanco[24], verde[24], azul[24], rojo[24], C, materias[24])
        }

        materias[25].setOnClickListener {
            matb[25] = EstadoonClick(matb[25], blanco[25], verde[25], azul[25], rojo[25], C, materias[25])
        }

        materias[26].setOnClickListener {
            matb[26] = EstadoonClick(matb[26], blanco[26], verde[26], azul[26], rojo[26], C, materias[26])
        }

        materias[27].setOnClickListener {
            matb[27] = EstadoonClick(matb[27], blanco[27], verde[27], azul[27], rojo[27], C, materias[27])
        }

        materias[28].setOnClickListener {
            matb[28] = EstadoonClick(matb[28], blanco[28], verde[28], azul[28], rojo[28], C, materias[28])
        }

        materias[29].setOnClickListener {
            matb[29] = EstadoonClick(matb[29], blanco[29], verde[29], azul[29], rojo[29], C, materias[29])
        }

        materias[30].setOnClickListener {
            matb[30] = EstadoonClick(matb[30], blanco[30], verde[30], azul[30], rojo[30], C, materias[30])
        }

        materias[31].setOnClickListener {
            matb[31] = EstadoonClick(matb[31], blanco[31], verde[31], azul[31], rojo[31], C, materias[31])
        }

        materias[32].setOnClickListener {
            matb[32] = EstadoonClick(matb[32], blanco[32], verde[32], azul[32], rojo[32], C, materias[32])
        }

        materias[33].setOnClickListener {
            matb[33] = EstadoonClick(matb[33], blanco[33], verde[33], azul[33], rojo[33], C, materias[33])
        }

        materias[34].setOnClickListener {
            matb[34] = EstadoonClick(matb[34], blanco[34], verde[34], azul[34], rojo[34], C, materias[34])
        }

        materias[35].setOnClickListener {
            matb[35] = EstadoonClick(matb[35], blanco[35], verde[35], azul[35], rojo[35], C, materias[35])
        }

        materias[36].setOnClickListener {
            matb[36] = EstadoonClick(matb[36], blanco[36], verde[36], azul[36], rojo[36], C, materias[36])
        }

        materias[37].setOnClickListener {
            matb[37] = EstadoonClick(matb[37], blanco[37], verde[37], azul[37], rojo[37], C, materias[37])
        }

        materias[38].setOnClickListener {
            matb[38] = EstadoonClick(matb[38], blanco[38], verde[38], azul[38], rojo[38], C, materias[38])
        }

        materias[39].setOnClickListener {
            matb[39] = EstadoonClick(matb[39], blanco[39], verde[39], azul[39], rojo[39], C, materias[39])
        }

        materias[40].setOnClickListener {
            matb[40] = EstadoonClick(matb[40], blanco[40], verde[40], azul[40], rojo[40], C, materias[40])
        }

        materias[41].setOnClickListener {
            matb[41] = EstadoonClick(matb[41], blanco[41], verde[41], azul[41], rojo[41], C, materias[41])
        }

        materias[42].setOnClickListener {
            matb[42] = EstadoonClick(matb[42], blanco[42], verde[42], azul[42], rojo[42], C, materias[42])
        }

        materias[43].setOnClickListener {
            matb[43] = EstadoonClick(matb[43], blanco[43], verde[43], azul[43], rojo[43], C, materias[43])
        }

        materias[44].setOnClickListener {
            matb[44] = EstadoonClick(matb[44], blanco[44], verde[44], azul[44], rojo[44], C, materias[44])
        }

        materias[45].setOnClickListener {
            matb[45] = EstadoonClick(matb[45], blanco[45], verde[45], azul[45], rojo[45], C, materias[45])
        }

        materias[46].setOnClickListener {
            matb[46] = EstadoonClick(matb[46], blanco[46], verde[46], azul[46], rojo[46], C, materias[46])
        }

        materias[47].setOnClickListener {
            matb[47] = EstadoonClick(matb[47], blanco[47], verde[47], azul[47], rojo[47], C, materias[47])
        }

        materias[48].setOnClickListener {
            matb[48] = EstadoonClick(matb[48], blanco[48], verde[48], azul[48], rojo[48], C, materias[48])
        }

        materias[49].setOnClickListener {
            matb[49] = EstadoonClick(matb[49], blanco[49], verde[49], azul[49], rojo[49], C, materias[49])
        }

        materias[0].setOnLongClickListener {
            val intent: Intent = Intent(this, Recordatorios::class.java)
            intent.putExtra("MATERIA", "Habilidades del pensamiento")
            startActivity(intent)
            true
        }

        materias[1].setOnLongClickListener {
            val intent: Intent = Intent(this, Recordatorios::class.java)
            intent.putExtra("MATERIA", "Seminario de sistemas")
            startActivity(intent)
            true
        }
    }

    fun Estado(matb: Char, azul: Int, verde: Int, rojo: Int, matr: View){

        if (matb == '1') {
            matr.setBackgroundResource(azul)
        } else if (matb == '2'){
            matr.setBackgroundResource(verde)
        } else if (matb == '3'){
            matr.setBackgroundResource(rojo)
        }

    }

    fun EstadoonClick(matb: Char, blanco: Int, verde: Int,azul: Int, rojo: Int, C: Int, matr: View): Char{
        var matb = matb
        var C=C
        if (matb == '3') {
            matr.setBackgroundResource(blanco)
            matb = '0'
        } else if (matb == '0') {
            matr.setBackgroundResource(azul)
            matb = '1'
            cred = cred - C
        } else if (matb == '1') {
            matr.setBackgroundResource(verde)
            matb = '2'
            cred = cred + C
        } else if (matb == '2') {
            matr.setBackgroundResource(rojo)
            matb = '3'
        }
        textView_Creditos!!.text = cred.toString()
        return matb
    }
}
