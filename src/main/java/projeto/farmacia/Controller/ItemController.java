package projeto.farmacia.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.farmacia.Entity.Item;
import projeto.farmacia.Service.ItemService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/items")  // Define a base URL para o controlador
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Endpoint para listar todos os itens
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    // Endpoint para buscar um item pelo ID
    @GetMapping("/{id}")
    public Optional<Item>getItemById(@PathVariable Long id){
        return itemService.getItemById(id);
    }

    // Endpoint para criar um novo item
    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.createItem(item);
    }

    // Endpoint para atualizar um item existente
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item itemDetails) {
       return itemService.updateItem(id, itemDetails);
    }

    // Endpoint para excluir um item pelo ID
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }
}
