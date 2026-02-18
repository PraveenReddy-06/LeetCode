select email as Email
from person
Group By email
Having Count(email)>1;