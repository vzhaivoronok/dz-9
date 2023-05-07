public class Woman extends Person{
    private String maidenName;

    public Woman(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
        this.setRetirementThreshold(60);
        this.maidenName = lastName;
    }

    @Override
    public void registerPartnership(Person partner) {
        super.registerPartnership(partner);
        this.setLastName(partner.getLastName());
    }

    @Override
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        super.deregisterPartnership(returnToPreviousLastName);
        if (returnToPreviousLastName){
            this.setLastName(maidenName);
        }
    }
}
