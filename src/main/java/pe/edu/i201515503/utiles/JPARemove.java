package pe.edu.i201515503.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import pe.edu.i201515503.domain.Country;

public class JPARemove {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Verifica si el país existe en la base de datos
            Country country = em.find(Country.class, "JA");

            if (country != null) {
                // Muestra el país antes de eliminarlo
                System.out.println("País encontrado: " + country.getName());
                em.remove(country);
                System.out.println("País " + country.getName() + " eliminado.");
            } else {
                System.out.println("País no encontrado.");
            }

            em.getTransaction().commit();

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






