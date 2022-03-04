module edu.cnm.deepdive {

  requires com.google.gson;

  opens edu.cnm.deepdive.model to com.google.gson;
  opens edu.cnm.deepdive to com.google.gson;
}