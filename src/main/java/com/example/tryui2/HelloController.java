package com.example.tryui2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button hotel;
    @FXML
    private Button flight;
    @FXML
    private Button tourguide;
    @FXML
    private Button activities;
    @FXML
    private Image image;
    @FXML
    private Button login;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button Homepage;
    @FXML
    private Button Homepage2;
    @FXML
    private Button gotocart;
    @FXML
    private Button Homepage3;
    @FXML
    private Button Homepage4;
    @FXML
    private Button confirmbooking, HomePage5;
    @FXML
    private Button confirmflight;


    @FXML
    private TextField countryinhotel;
    @FXML
    private Button addreq;
    @FXML
    private TextField destcity, hotelChoice;
    @FXML
    private Button addreqf;
    @FXML
    private Label outputflight, usernow;
    @FXML
    private Button confirmpayment;
    @FXML
    private Label messagesuccesful;
    @FXML
    private Label totalprice;
    @FXML
    private Label Scart11;
    @FXML
    private Label loginmessage;
    @FXML
    private Label hotelNames, hotelCategories, hotelCities, hotelPrices;

    @FXML
    void gonext0(MouseEvent event) throws Exception {
        String tmpU = username.getText();
        String tmpP = password.getText();

        for (int i = 0; i < Program.getTourists().size(); i++) {
            if ((Program.getTourists().get(i).getUsername().equals(tmpU)) && (Program.getTourists().get(i).getPassword().equals(tmpP))) {
try{
   usernow.setText(tmpU);
}catch(Exception e){

}
                Stage stage = (Stage) login.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                stage.setScene(new Scene(root));
                stage.show();

            }
            loginmessage.setText("Wrong Password or User does not exist");

    }

    @FXML
    void gonext(MouseEvent event) throws Exception {
        Stage stage = (Stage) hotel.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hotelview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void gonext2(MouseEvent event) throws Exception {
        Stage stage = (Stage) flight.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("flightview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void gonext3(MouseEvent event) throws Exception {
        Stage stage = (Stage) tourguide.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("tourguideview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void gonext4(MouseEvent event) throws Exception {
        Stage stage = (Stage) activities.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("activitiesview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void gohome(MouseEvent event) throws Exception {
        Stage stage = (Stage) Homepage.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();


    }

    @FXML
    void gohome2(MouseEvent event) throws Exception {
        Stage stage = (Stage) Homepage2.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();


    }

    @FXML
    void gohome3(MouseEvent event) throws Exception {
        Stage stage = (Stage) Homepage3.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void gohome4(MouseEvent event) throws Exception {
        Stage stage = (Stage) Homepage4.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void gocart(MouseEvent event) throws Exception {
        Stage stage = (Stage) gotocart.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("shopping.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

        @FXML
        void confirmbookingh (MouseEvent event) throws Exception {
            String c = hotelChoice.getText();
            for (int i = 0; i < Program.getHotels().size(); i++) {
                if (c.equals(Program.getHotels().get(i).gethotelName())) {
                    for (int j = 0; j < Program.getTourists().size(); j++) {
                        if (username.getText().equals(Program.getTourists().get(j).getUsername())) {
                            Program.getTourists().get(j).additem(Program.getHotels().get(i));
                        }
                    }
                }
            }

            Stage stage = (Stage) confirmbooking.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            stage.setScene(new Scene(root));
            stage.show();
        }
        @FXML
        void loadcartdata (MouseEvent event){
            String s = "";
            for (int j = 0; j < Program.getTourists().size(); j++) {
                if (username.getText().equals(Program.getTourists().get(j).getUsername())) {
                    s = Program.getTourists().get(j).getcart().showItems();
                }
            }
            Scart11.setText(s);
            Scart11.setTextFill(Paint.valueOf("Black"));
        }

        @FXML
        void confirmbookingf (MouseEvent event) throws Exception {

            Stage stage = (Stage) confirmflight.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("shopping.fxml"));
            stage.setScene(new Scene(root));
            stage.show();
        }

        @FXML
        public void showreq (MouseEvent event) throws Exception {
            String c = countryinhotel.getText();
            String names = "";
            String categories = "";
            String cities = "";
            String prices = "";

            for (int i = 0; i < Program.getHotels().size(); i++) {
                if (c.equals(Program.getHotels().get(i).getCity())) {
                    names += Program.getHotels().get(i).gethotelName() + "\n";
                    categories += Program.getHotels().get(i).getGuestcategory() + "\n";
                    cities += Program.getHotels().get(i).getCity() + "\n";
                    prices += Program.getHotels().get(i).getPrice() + "\n";
                }
            }
            if (c.equals("")) {
                for (int i = 0; i < Program.getHotels().size(); i++) {
                    names += Program.getHotels().get(i).gethotelName() + "\n";
                    categories += Program.getHotels().get(i).getGuestcategory() + "\n";
                    cities += Program.getHotels().get(i).getCity() + "\n";
                    prices += Program.getHotels().get(i).getPrice() + "\n";
                }
            }
            hotelNames.setText(names);
            hotelCategories.setText(categories);
            hotelCities.setText(cities);
            hotelPrices.setText(prices);
        }

    @FXML
    public void showreqf(MouseEvent event) throws Exception {
        String c1 = destcity.getText();
        String pf = "";
        for (int i = 0; i < Program.getFlights().size(); i++) {
            if (c1.equals(Program.getFlights().get(i).getArriving_Airport())) {
                pf += Program.getFlights().get(i).toString() + "\n";
            }
        }
        outputflight.setText(pf);
        outputflight.setTextFill(Paint.valueOf("Black"));
    }

        @FXML
        public void showCart (MouseEvent event) throws Exception {
            String psh = "";
            for (int i = 0; i < Program.getTourists().size(); i++) {
                if (Program.getTourists().get(i).getUsername().equals(username.getText())) {
                    psh = Program.getTourists().get(i).getcart().showItems();
                }
            }
            Scart11.setText(psh);
            Scart11.setTextFill(Paint.valueOf("Black"));
        }
        @FXML
        public void gohome5 (MouseEvent event )throws Exception {
            Stage stage = (Stage) HomePage5.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

            stage.setScene(new Scene(root));
            stage.show();
        }
    }



}