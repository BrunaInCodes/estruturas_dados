interface Empilhavel {
    //metodos principais
    fun empilhar(dado: Any)
    fun desempilhar(): Any?

    //metodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
    fun atualizar(dado: Any?)
}