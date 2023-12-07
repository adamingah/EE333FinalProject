/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OMS;

/**
 *
 * @author jmyer
 */
class SettingsInfo {

        private String productRepository;
        private String userRepository;
        private String orderRepository;
        private String format;

        // This is the generic constructor for the SettingsInfo class.
        public SettingsInfo() {
            productRepository = "";
            userRepository = "";
            orderRepository = "";
            format = "";
        }
        
        // This is the full constructor for the SettingsInfo class.
        public SettingsInfo(String productRepository, String userRepository, String orderRepository, String format) {
            // To-Do: Validation
            this.productRepository = productRepository;
            this.userRepository = userRepository;
            this.orderRepository = orderRepository;
            this.format = format;
        }

        public static OMS.SettingsInfo getSettingsInfo() {

            /*

            This function imports information from a hard-coded settings file, "SettingInfo.xml",
            and returns a SettingsInfo object with the information obtained from the
            settings file.

            */

            java.io.File inputFile = new java.io.File("SettingInfo.xml");
            java.io.FileReader inputFileReader  = null;
            java.io.BufferedReader inputBufferedReader = null;
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String contents = "";
            String line = "";
            String productRepository;
            String userRepository;
            String orderRepository;
            String format;
            SettingsInfo newSettings = null;

            if(inputFile.exists() == true) {
                try {
                    inputFileReader = new java.io.FileReader(inputFile);
                    inputBufferedReader = new java.io.BufferedReader(inputFileReader);

                    while((line = inputBufferedReader.readLine()) != null) {
                        contents += line;
                    }

                    inputBufferedReader.close();
                    inputFileReader.close();

                    java.util.regex.Pattern regex = java.util.regex.Pattern.compile("<settingsInfo>\\s*"
                                                                                    + "<productRepository>(\\w*)</productRepository>");
                                                                                    //+ "<userRepository>(\\w*)</userRepository>\\s*"
                                                                                    //+ "<orderRepository>(\\w*)</orderRepository>\\s*"
                                                                                    //+ "<format>(\\w*)</format>");
                    java.util.regex.Matcher matcher = regex.matcher(contents);

                    System.out.println(matcher.find());
//                    if(matcher.find() == true) {
//                        
//                        productRepository = matcher.group(1);
//                        userRepository = matcher.group(2);
//                        orderRepository = matcher.group(3);
//                        format = matcher.group(4);
//
//                        newSettings = new SettingsInfo(productRepository, userRepository, orderRepository, format);
//
//                    } else {
//                        System.out.println("In getSettingsInfo() -- Warning: Settings file format incorrect!");
//                    }

                } catch(Exception ex) {
                    System.out.println("In getSettingsInfo() -- Error: Exception thrown!\n" + ex.toString());
                }
            } else {
                // To-Do: Figure out how to do the setup wizard in the GUI
//                System.out.println("This is the wizard for the settings file for this program.");
//
//                System.out.println("Please enter a repository file name (exclude file extension).");
//                productRepository = scanner.nextLine();
//                System.out.println("Please enter a respository file format (csv, custom, json, or xml are supported filetypes)");
//                format = scanner.nextLine();
//
//                newSettings = new SettingsInfo();
//                newSettings.setFormat(format);
//                newSettings.setRepository(productRepository);
//
//                newSettings.setSettingsInfo();
            }
            return(newSettings);
        }

        public boolean setSettingsInfo() {
            // Write contents of an XML file with the updated application settings
            boolean output = true;
            java.io.File settingsInfoFile = new java.io.File("SettingInfo.xml");
            java.io.FileWriter settingsInfoWriter = null;

            try {
                // Upgrade later --> Rename existing settings file to a date/time
                //                   to archive it
                settingsInfoWriter = new java.io.FileWriter("SettingInfo.xml");

                settingsInfoWriter.write(this.toXML());

                settingsInfoWriter.close();
            } catch(Exception ex) {
                System.out.println("in setSettingsInfo() -- " + ex.toString());
                output = false;
            }

            return(output);
        }

        public String getRepository() {
            return this.productRepository;
        }

        public void setRepository(String repository) {
            this.productRepository = repository;
        }

        public String getFormat() {
            return this.format;
        }

        public void setFormat(String format) {
            if((format.equalsIgnoreCase("custom") == true) || (format.equalsIgnoreCase("csv") == true) || 
               (format.equalsIgnoreCase("json") == true) || (format.equalsIgnoreCase("xml") == true)) {
                this.format = format;
            } else {
                System.out.println("In settingsInfo.setFormat() -- Warning: Unsupported format!");
            }
        }

        public String toXML() {
            String output = "";

            output += "<settingsInfo>\n";
            output += "    <productRepository>" + this.productRepository + "</productRepository>\n";
            output += "    <userRepository>" + this.userRepository + "</userRepository>\n";
            output += "    <orderRepository>" + this.orderRepository + "</orderRepository>\n";
            output += "    <format>" + this.format + "</format>\n";
            output += "</settingsInfo>\n";

            return(output);
        }
    }
