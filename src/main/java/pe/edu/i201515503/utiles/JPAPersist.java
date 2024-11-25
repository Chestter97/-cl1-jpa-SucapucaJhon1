package pe.edu.i201515503.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201515503.domain.Continent;
import pe.edu.i201515503.domain.Country;

public class JPAPersist {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // Registrar los países
        try {
            em.getTransaction().begin();

            // Define países

            Country japon = new Country(
                    "JA", "Japón", Continent.Asia, "Tokio", 122200.0, 2024, 9000000,
                    85.0, 15000.0, 89000.0, "Yen", "Monarquía constitucional", "Naruhito", 1, "SP1");

            Country australia = new Country(
                    "AU", "Australia", Continent.Oceania, "Canberra", 7692024.0, 2024, 26177300,
                    99.9, 83.3, 3.9, "Dólar Australiano", "Monarquía constitucional", "Carlos III", 4, "CT3");

            Country belgica = new Country(
                    "BE", "Bélgica", Continent.Europe, "Bruselas", 30528.0, 2024, 11656575,
                    99.9, 81.8, 3.5, "Euro", "Monarquía federal", "Felipe", 5, "CT3");

            // Persiste países
            em.persist(japon);
            em.persist(australia);
            em.persist(belgica);

            em.getTransaction().commit();

            System.out.println("Países Registrados con Exito.");

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

}

