// [Template no Kotlin Playground](https://pl.kotl.in/8md-t8bf1)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

val usuario: MutableList<String> = mutableListOf("Thales", "Bianca")
val inscritos: List<String> = usuario

 //foi criada uma função matricular para adcionar um novo usuário. 
 //a lista de inscritos retorna os nomes de todos os inscritos, incluindo novas matriculas.
    
    fun matricular(newUsuario: String){  
    usuario.add(newUsuario) 
    }
     
fun getinscritos(): List<String> {
    return inscritos
}

data class ConteudoEducacional(var nome: String, var atividades: Int, var horasDeDuracao: Int){
    
}


data class Formacao(val nome: String, val listconteudos: List<ConteudoEducacional>, val nivel: Nivel) {
}


fun main() {
    
    // criar lista de inscritos
    matricular("Carla")
    matricular("Theo")
    println("Usuários Inscritos:")
    
    getinscritos().forEach {
        i -> println("$i")
    }
    println("")
    
    
    val curso1 = ConteudoEducacional("Princípios de Agilidade e Desenvolvimento de Software", 8, 15)
    val curso2 = ConteudoEducacional("Dominando a Linguagem de Programação Kotlin", 6, 11)
    val curso3 = ConteudoEducacional("Refinando Sua Técnica Com Desafios de Código em Kotlin", 5, 5)
    val curso4 = ConteudoEducacional("Fortalecendo Seu Perfil Profissional", 4, 5)
    
    val listconteudos= mutableListOf<ConteudoEducacional>()
    listconteudos.add(curso1)
    listconteudos.add(curso2)
    listconteudos.add(curso3)
    listconteudos.add(curso4)

    val formacaoKotlinExperience = Formacao("Kotlin Experience", listconteudos, Nivel.INTERMEDIARIO)
   
   println("${formacaoKotlinExperience.nome} - ${formacaoKotlinExperience.nivel}")   
   listconteudos.forEach {
        i -> println("$i")
   }
}

