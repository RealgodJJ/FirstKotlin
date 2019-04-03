class SmallHeadFather : IWashBowl by BigHeadSon {
    override fun washing() {
        println("我是小头爸爸，我洗碗可以获得10元钱！")
        BigHeadSon.washing()
        println("我让儿子把碗洗完了！我洗碗可以获得9元钱！")
    }
//
//    fun agentWashing() {
//        println("我是小头爸爸，我洗碗可以获得10元钱！")
//        BigHeadSon().washing()
//        println("我让儿子把碗洗完了！我可以获得9元钱！")
//    }

}