class Atleta(nome:String) {
    private var peso:Double = 0.0
    private var altura:Double = 0.0
    init {
        println("Atleta $nome matriculado!")
    }
    fun registrarNotas(p: Double, a: Double){
        if(p <= 0.0 || a <= 0.0){
            println("Dados Inválidos!")
        }
        else {
            peso = p
            altura = a
        }
    }
    fun calcularIMC(peso: Double, altura: Double):Double{
        return peso / (altura * altura)
    }
    fun verificarCategoria(imc: Double):String{
        if (imc < 18.5) {
            return "Abaixo do preço"
        }
        else if(imc >= 18.5 && imc < 24.9){
            return "Peso Normal"
        }
        else if(imc >= 25.0) {
            return "Sobre Peso"
        }
        else {
            return "Inválido!"
        }
    }
}
fun main() {
    println("-------------------")
    println("Digite o nome do atleta: ")
    val nomeAtleta = readln()
    println("Digite a altura do atleta: ")
    val altura = readln().toDouble()
    println("Digite o peso do atleta: ")
    val peso = readln().toDouble()
    val atleta1 = Atleta(nomeAtleta)
    atleta1.registrarNotas(peso, altura)
    val imc = atleta1.calcularIMC(peso, altura)
    val categoria = atleta1.verificarCategoria(imc)
    println("O atleta $nomeAtleta tem IMC de $imc e ta na categoria $categoria")
}