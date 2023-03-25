import gym.model.services.*;

public class GymModel {
    
    private final InventarioService inventarioService;
    private final VentaService ventaService;
    private final EncuestaService encuestaService;
    private final ClaseService claseService;
    
    public GymModel() {
        this.inventarioService = new InventarioServiceImpl();
        this.ventaService = new VentaServiceImpl();
        this.encuestaService = new EncuestaServiceImpl();
        this.claseService = new ClaseServiceImpl();
    }
    
    public InventarioService getInventarioService() {
        return inventarioService;
    }
    
    public VentaService getVentaService() {
        return ventaService;
    }
    
    public EncuestaService getEncuestaService() {
        return encuestaService;
    }
    
    public ClaseService getClaseService() {
        return claseService;
    }
}
