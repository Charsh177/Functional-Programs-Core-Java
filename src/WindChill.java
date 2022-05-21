import javax.swing.*;	// provides JOptionPane
import java.text.*;	// provides DecimalFormat

class WindChill {

    public static void main(String[] args) {
        double fTemp = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Fahrenheit temperature"));
        double cTemp = (fTemp-32.)*5./9.;
        double mphSpeed = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter wind speed in mph"));
        double warpedKphSpeed = Math.pow(mphSpeed*1.609, 0.16);
        double fWindChill = 32. + (9./5.)*( 13.12 + 0.6215*cTemp - 11.37*warpedKphSpeed + 0.3965*cTemp*warpedKphSpeed );
        DecimalFormat form = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "Those values yield a windchill temperature of " + form.format(fWindChill) + " degrees Fahrenheit");
    }

}
