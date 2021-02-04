import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneDatabase {

    private List<Phone> phones = Lists.newArrayList();

    public PhoneDatabase() {
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public PhoneDatabase(List<Phone> phones) {
        this.phones = phones;
    }

    public boolean add(Phone phone) {
        return phones.add(phone);
    }

    public List<Phone> filterByProcessorProducent(ProcessorProducent processorProducent) {
        return phones.stream()
                .filter(processor -> processor.getProcessorProducent()==processorProducent)
                .collect(Collectors.toList());
    }

}
