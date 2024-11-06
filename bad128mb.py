import random

# Define the size of the data (1 MB)
size_in_bytes = 1024 * 1024  # 1 MB

# Open the file to write non-securely generated data
with open('bad.dat', 'wb') as f:
    for _ in range(size_in_bytes):
        # Writing one byte at a time using the non-secure random generator
        f.write(random.getrandbits(8).to_bytes(1, 'little'))

print("Generated 1 MB of non-secure random data in bad.dat.")
