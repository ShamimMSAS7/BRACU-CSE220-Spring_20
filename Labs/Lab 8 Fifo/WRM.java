public interface WRM{
  void registerPatient();
  Patient servePatient();
  void cancelAll();
  boolean canDoctorGoHome();
  void showAllPatient();
}