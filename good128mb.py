import secrets

# Define the size of the data (1 MB)
size_in_bytes = 1024 * 1024  # 1 MB

# Open the file to write securely generated data
with open('good.dat', 'wb') as f:
    # Write 1 MB of cryptographically secure random bytes
    f.write(secrets.token_bytes(size_in_bytes))

print("Generated 1 MB of cryptographically secure data in good.dat.")
