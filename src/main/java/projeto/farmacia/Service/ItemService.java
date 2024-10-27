package projeto.farmacia.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import projeto.farmacia.Entity.Item;
import projeto.farmacia.Repository.ItemRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems(){
    return itemRepository.findAll();

    }
    public Optional<Item> getItemById(Long id){
        return itemRepository.findById(id);
    }

    public Item createItem(Item item){
        return itemRepository.save(item);
    }
    public Item updateItem(Long id, Item itemDetails){
        Item item= itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not Found"));
        item.setName(itemDetails.getName());
        item.setDescription(itemDetails.getDescription());
        item.setQuantity(itemDetails.getQuantity());
        item.setPrice(itemDetails.getPrice());
        return itemRepository.save(item);
    }
    public void deleteItem(Long id){
        Item item= itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not Found"));
        itemRepository.delete(item);
    }
}
