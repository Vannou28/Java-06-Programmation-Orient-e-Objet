class Classroom {
    
    public static void main(String[] args) {
    
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);

        System.out.println(jeanClaude.whoAmI());
        System.out.println(henri.whoAmI());
    
    }
}