

car_slot = [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ]
for index in range(len(car_slot)):
"""
Welcome To Mini Park Slot
1. Occupy a slot
2. Leave a slot
"""
print(car_slot)
car_slot_choice = int(input("select an option: "))
match car_slot_choice:
        
        case 1: 
                print("Occupy a slot")
                
                occupy = """
1. Enter a slot number between (1-20) or 1: 
"""
                print(occupy)
                car_slot_choice = int(input("select an option: "))
                match car_slot_choice:
                    case 1: 
                        print("Occupy a slot")
                         occupy_a_slot = """
1. Enter specific slot number: 
"""
                        
                

                print(len(car_slot))

