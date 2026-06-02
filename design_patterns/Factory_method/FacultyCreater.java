package design_patterns.Factory_method;

class FacultyCreator
        extends UserCreator {

    @Override
    User createUser() {

        return new Faculty();
    }
}
