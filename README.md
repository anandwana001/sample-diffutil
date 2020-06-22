# sample-diffutil

DiffUtil check and compare the old and new list for recycler view and only update that item which has modified. `onBindViewHolder` only called for that item also. Other remains as it is. Whereas earlier `notifyDataSetChanged` recreate all the items and which a bit expensive work. 

I had used a generic type `diffutil` class here. 