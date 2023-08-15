package tarefa.validators;

public interface ValidateForm {

    static boolean validateInput(String input) {
      if (input.matches("[^a-zA-z, -]")) {
          return false;
      } else {
          return true;
      }
    };
}
