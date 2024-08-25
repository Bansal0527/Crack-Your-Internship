import requests

url = "https://api.sarvam.ai/text-to-speech"

payload = {
    "inputs": ["Hello how are you , I am testing this sarvam ai"],
    "target_language_code": "en-IN",
    "speaker": "meera",
    "pitch": 0,
    "pace": 1.65,
    "loudness": 2,
    "speech_sample_rate": 8000,
    "enable_preprocessing": True,
    "model": "bulbul:v1"
}
headers = {
    'API-Subscription-Key': '0f59d491-1fe6-4d30-88b3-41f80b45e9dc',
    "Content-Type": "application/json"
    }

response = requests.request("POST", url, json=payload, headers=headers)

print(response.text)