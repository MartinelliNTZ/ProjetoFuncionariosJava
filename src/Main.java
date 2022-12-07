public class Main {
    private static  final  DatabaseMySQL databaseMySQL = new DatabaseMySQL();
    public static void main(String[] args) {
        save( new Funcionario("Matheus",2f));
        save( new Funcionario("Leandra",28000.50f));
        save( new Funcionario("Handreya",2222f));
        save( new Funcionario("Claudislane",288f));
        save( new Funcionario("Xerlisclayson",9992f));

    }
    public static void save(Funcionario funcionario){
        databaseMySQL.salvarDados(funcionario);
    }
}