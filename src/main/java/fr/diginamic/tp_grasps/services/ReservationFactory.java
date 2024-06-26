package fr.diginamic.tp_grasps.services;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationFactory {

	public ReservationFactory() {
		// TODO Auto-generated constructor stub
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	public static Reservation creerReservation(LocalDateTime dateReservation, TypeReservation type, int nbPlaces,
			Client client) {
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);

		// Ajout de la réservation au client
		client.getReservations().add(reservation);
		
		// Calcul du montant total de la réservation qui dépend:
		// - du nombre de places
		// - de la réduction qui s'applique si le client est premium ou non
		
		double total = type.getMontant() * nbPlaces;
		if (client.isPremium()) {
			reservation.setTotal(total * (1 - type.getReductionPourcent() / 100.0));
		} else {
			reservation.setTotal(total);
		}

		return reservation;
	}
}
