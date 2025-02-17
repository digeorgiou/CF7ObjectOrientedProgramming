package lambda_advanced;

//φτιαχνουμε ενα interface στο οποιο θα περασουμε lambdas
@FunctionalInterface
public interface ITeacherFilter {
    boolean filterId(Teacher teacher);
}
