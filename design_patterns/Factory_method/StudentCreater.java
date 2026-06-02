package design_patterns.Factory_method;

class StudentCreator
        extends UserCreator {

    @Override
    User createUser() {

        return new Student();
    }
}